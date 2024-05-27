package com.xiao.service;

import com.xiao.domain.Architect;
import com.xiao.domain.Designer;
import com.xiao.domain.Employee;
import com.xiao.domain.Programmer;

import java.util.concurrent.TimeoutException;

/**
 * ClassName: TeamService
 * Package: com.xiao.service
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 15:36
 * @Version 1.0
 */
public class TeamService {
    private static int memberId = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
//        成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
//        该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//        该员工已是某团队成员
//        该员工正在休假，无法添加
        Programmer p = (Programmer) e;
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员正在休假，无法添加");
        }
//        该员工已在本开发团队中
        if (isExist(p)) {
            throw new TeamException("该员工已在本开发团队中");
        }
//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员

        int numOfArch = 0, numOfDsgn = 0, numOfPrg = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            }
            if (team[i] instanceof Designer) {
                numOfDsgn++;
            }
            if (team[i] instanceof Programmer) {
                numOfPrg++;
            }
        }
        if (p instanceof Architect) {
            if (numOfArch >= 1)
                throw new TeamException("团队中至多只能有一名架构师");
        } else if (p instanceof Designer) {
            if (numOfDsgn >= 2)
                throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer) {
            if (numOfPrg >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        p.setStatus(Status.BUSY);
        p.setMemberld(this.memberId++);
        team[total++] = p;

    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int n = 0;
        for (; n < total; n++) {
            if (team[n].getMemberld() == memberId) {
                team[n].setStatus(Status.FREE);
                break;
            }
        }
        if (n == total) {
            throw new TeamException("找不到该员工");
        }
        for (int i = n + 1; i < total; i++) {
            team[i - 1] = team[i];
        }
        team[--total] = null;
    }
}
