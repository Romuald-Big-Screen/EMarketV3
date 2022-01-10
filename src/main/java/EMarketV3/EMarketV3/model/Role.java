package EMarketV3.EMarketV3.model;

import javax.persistence.*;

@Entity
@Table(name="ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long roleId;
    private String roleName;

    public Role() {
        super();
    }

    public Role(String roleName) {
        super();
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
