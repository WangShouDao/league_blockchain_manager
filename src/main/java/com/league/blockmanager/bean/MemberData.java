package com.league.blockmanager.bean;

import com.league.blockmanager.model.Member;

import java.util.List;

public class MemberData extends BaseData {
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
