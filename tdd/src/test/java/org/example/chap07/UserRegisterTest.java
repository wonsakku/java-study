package org.example.chap07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegisterTest {

    private UserRegister userRegister;
    private StubeWeakPasswordChecker stubWeakPasswordChecker = new StubeWeakPasswordChecker();
    private MemoryUserRepository fakeRepository = new MemoryUserRepository();
    private SpyEmailNotifier spyEmailNotifier = new SpyEmailNotifier();

    @BeforeEach
    void setUp() {
        userRegister = new UserRegister(stubWeakPasswordChecker, fakeRepository, spyEmailNotifier);
        stubWeakPasswordChecker.setWeak(false);
    }

    @DisplayName("약한 암호면 가입 실패")
    @Test
    void weakPassword(){
        stubWeakPasswordChecker.setWeak(true);

        assertThrows(WeakPasswordException.class, () -> {
            userRegister.register("id", "pw", "emil");
        });
    }


    @DisplayName("같은 ID가 존재하면 가입 실패")
    @Test
    void dupIdExists(){
        fakeRepository.save(new User("id", "pw1", "email@email.com"));
        assertThrows(DupIdException.class, () -> {
           userRegister.register("id", "pw2", "email");
        });
    }


    @DisplayName("같은 ID가 없으면 가입 성공합")
    @Test
    void noDupId_RegisterSuccess(){
        userRegister.register("id", "pw", "email");
        final User savedUser = fakeRepository.findById("id");
        assertEquals("id", savedUser.getId());
        assertEquals("email", savedUser.getEmail());
    }

    @DisplayName("가입하면 메일을 전송함")
    @Test
    void whenRegisterThenSendMail(){
        userRegister.register("id", "pw" ,"email@email.com");
        assertTrue(spyEmailNotifier.isCalled());
        assertEquals("email@email.com", spyEmailNotifier.getEmail());
    }



}









