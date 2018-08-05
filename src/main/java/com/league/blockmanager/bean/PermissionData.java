package com.league.blockmanager.bean;

import com.league.blockmanager.model.Permission;

import java.util.List;

public class PermissionData extends BaseData {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
