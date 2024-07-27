package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testIsRetired() {
        Woman youngWoman = new Woman("Ганна", "Сидорова", 28);
        Woman oldWoman = new Woman("Марія", "Іванова", 65);

        Assert.assertFalse(youngWoman.isRetired(), "Молода жінка не повинна бути на пенсії");
        Assert.assertTrue(oldWoman.isRetired(), "Старенька повинна піти на пенсію");
    }

    @Test
    public void testSettersAndGetters() {
        Woman woman = new Woman("Ганна", "Сидорова", 28);
        woman.setFirstName("Олена");
        woman.setLastName("Пилипенко");
        woman.setAge(35);

        Assert.assertEquals(woman.getFirstName(), "Олена", "Ім'я має бути Олена");
        Assert.assertEquals(woman.getLastName(), "Пилипенко", "Прізвище має бути Пилипенко");
        Assert.assertEquals(woman.getAge(), 35, "Вік повинен бути 35");
    }

    @Test
    public void testOriginalLastName() {
        Woman woman = new Woman("Ганна", "Сидорова", 28);
        Assert.assertEquals(woman.getOriginalLastName(), "Сидорова", "Оригінальне прізвище має бути Сидорова");
    }
}
