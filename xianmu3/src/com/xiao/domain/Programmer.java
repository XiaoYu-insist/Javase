package com.xiao.domain;

import com.xiao.service.Status;

/**
 * ClassName: Programmer
 * Package: com.xiao.domain
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 14:15
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberld;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberld() {
        return memberld;
    }

    public void setMemberld(int memberld) {
        this.memberld = memberld;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getMemberDetails() {
        return getMemberld() + "/" + getMessage();
    }

    public String getMessageProgrammer(){
        return getMemberDetails()+"\t程序员\t";
    }

    @Override
    public String toString() {
        return getMessage()+'\t'+status+"\t程序员"+"\t\t\t\t\t"+equipment.getDescription();
    }
}
