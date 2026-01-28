package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("Личный кабинет")
@Feature("Авторизация пользователей")
@Owner("ТВОЙ_НИК") // Обязательно смени на свой
public class AuthTests {

    @Test
    @Story("Вход по номеру телефона")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Успешная авторизация в маркетплейсе")
    @Description("Проверка входа в систему при вводе корректного кода из SMS")
    @Tag("web")
    void successfulAuthTest() {
        step("Открыть страницу авторизации", () -> {

        });
        step("Ввести номер телефона +79991234567", () -> {

        });
        step("Нажать кнопку 'Получить код'", () -> {
            step("Дождаться появления поля для кода");
        });
        step("Ввести проверочный код 1234", () -> {
            /
        });
        step("Проверить, что отображается имя профиля 'Александр'");
    }

    @Test
    @Story("Вход с некорректными данными")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Показ ошибки при вводе неверного кода")
    @Description("Система должна выдавать предупреждение, если код из SMS не совпадает")
    @Tag("web")
    void failedAuthWithWrongCodeTest() {
        step("Открыть страницу авторизации");
        step("Ввести валидный номер телефона");
        step("Ввести неверный код из SMS '0000'");
        step("Нажать подтвердить", () -> {
            step("Проверить текст ошибки: 'Неверный код, попробуйте еще раз'");
            step("Проверить, что кнопка 'Войти' заблокирована");
        });
    }
}
