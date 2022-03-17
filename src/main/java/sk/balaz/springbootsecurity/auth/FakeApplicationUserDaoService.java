package sk.balaz.springbootsecurity.auth;

import java.util.Optional;

public class FakeApplicationUserDaoService implements ApplicationUserDao {
    @Override
    public Optional<ApplicationUser> selectApplicationUserByUserName(String username) {
        return Optional.empty();
    }
}
