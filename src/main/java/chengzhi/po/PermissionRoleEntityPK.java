package chengzhi.po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/18/018.
 */
public class PermissionRoleEntityPK implements Serializable {
    private int permissionId;
    private int roleId;

    @Column(name = "permission_id")
    @Id
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Column(name = "role_id")
    @Id
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermissionRoleEntityPK that = (PermissionRoleEntityPK) o;

        if (permissionId != that.permissionId) return false;
        if (roleId != that.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permissionId;
        result = 31 * result + roleId;
        return result;
    }
}
