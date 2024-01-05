package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testSettingUserHeight() {
        User user = new User();

        user.setUserHeight(180);

        assertEquals(180, user.getUserHeight());
    }
    @Test
public void testUserweight() {
  User user = new User();
  user.setWeight(70);
assertEquals(70, user.getWeight());
}
}  
