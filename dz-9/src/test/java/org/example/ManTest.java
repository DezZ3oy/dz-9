package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {

    @Test
    public void testIsRetired() {
        Man youngMan = new Man("Ігнат", "Фещенко", 30);
        Man oldMan = new Man("Василь", "Кудрицький", 70);
        Assert.assertFalse(youngMan.isRetired(), "Молода людина не повинна бути на пенсії");
        Assert.assertTrue(oldMan.isRetired(), "Старий повинен піти на пенсію");
    }

    @Test
    public void testRegisterPartnership() {
        Man man = new Man("Кирило", "Пацюк", 30);
        Woman woman = new Woman("Ганна", "Лещенко", 28);

        man.registerPartnership(woman);
        Assert.assertEquals(woman.getPartner(), man, "Партнером має бути чоловік");
        Assert.assertEquals(man.getPartner(), woman, "Партнером має бути жінка");
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Прізвище має збігатися з прізвищем чоловіка");
    }

    @Test
    public void testDeregisterPartnership() {
        Man man = new Man("Володимир", "Гонець", 30);
        Woman woman = new Woman("Ліля", "Пилипенко", 28);

        man.registerPartnership(woman);
        man.deregisterPartnership(true);
        Assert.assertNull(man.getPartner(), "Партнер чоловіка повинен бути нульовим");
        Assert.assertNull(woman.getPartner(), "Партнер жінки повинен бути нульовим");
        Assert.assertEquals(woman.getLastName(), "Пилипенко", "Прізвище має бути оригінальним");
    }

    @Test
    public void testSettersAndGetters() {
        Man man = new Man("Семен", "Хорець", 30);
        man.setFirstName("Євген");
        man.setLastName("Васильченко");
        man.setAge(35);

        Assert.assertEquals(man.getFirstName(), "Євген", "Ім'я має бути Євген");
        Assert.assertEquals(man.getLastName(), "Васильченко", "Прізвище має бути Васильченко");
        Assert.assertEquals(man.getAge(), 35, "Вік повинен бути 35");
    }
}
