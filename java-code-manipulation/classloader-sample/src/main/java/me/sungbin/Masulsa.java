package me.sungbin;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {
//        ClassLoader classLoader = Masulsa.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//        try {
//            new ByteBuddy()
//                    .redefine(typePool.describe("me.sungbin.Moja").resolve(),
//                            ClassFileLocator.ForClassLoader.of(classLoader))
//                    .method(named("pullOut"))
//                    .intercept(FixedValue.value("Rabbit!"))
//                    .make()
//                    .saveIn(new File("/Users/rovert/Desktop/study/2024/java/java-code-manipulation/classloader-sample/build/classes/java/main/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(new Moja().pullOut());
    }
}
