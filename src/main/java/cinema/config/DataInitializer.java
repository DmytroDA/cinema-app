package cinema.config;

import cinema.model.Role;
import cinema.model.Role.RoleName;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;

public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.USER);
        roleService.add(userRole);
        User adminUser = new User();
        adminUser.setEmail("adminUser@gmail.com");
        adminUser.setPassword("@13Admin13");
        adminUser.setRoles(Set.of(adminRole));
        userService.add(adminUser);
    }
}
