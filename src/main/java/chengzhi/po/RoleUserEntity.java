package chengzhi.po;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/18/018.
 */
@Entity
@Table(name = "role_user", schema = "chengzhi", catalog = "")
@IdClass(RoleUserEntityPK.class)
public class RoleUserEntity {
    private int userId;
    private int roleId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        RoleUserEntity that = (RoleUserEntity) o;

        if (userId != that.userId) return false;
        if (roleId != that.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + roleId;
        return result;
    }
}
