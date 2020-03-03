package com.company;

/*

1214 The cow is also an animal.
Inherit the Animal Cow class.
Implement all the missing methods in the Cow class.

Requirements:
1. The Animal class must be abstract.
2. The Cow class should not be abstract.
3. The Cow class must inherit from the Animal class.
4. The Cow class must implement the abstract method from the Animal class.
5. The getName () method of the Cow class should return any cow name.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Корова";
        }
    }
}
