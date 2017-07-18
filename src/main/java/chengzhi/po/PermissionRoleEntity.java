package chengzhi.po;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/18/018.
 */
@Entity
@Table(name = "permission_role", schema = "chengzhi", catalog = "")
@IdClass(PermissionRoleEntityPK.class)
public class PermissionRoleEntity {

    private int permissionId;
    private int roleId;

    @Id
    @Column(name = "permission_id")
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Id
    @Column(name = "role_id")
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

        PermissionRoleEntity that = (PermissionRoleEntity) o;

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
