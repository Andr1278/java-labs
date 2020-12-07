package com;
import java.lang.annotation.*;
@Target(value=ElementType.FIELD) // Что именно помечается аннотацией (поле)
@Retention(value= RetentionPolicy.RUNTIME) // жизненный цикл аннотации(видна в процессе выполнения)
public @interface AutoInjectable {
}

