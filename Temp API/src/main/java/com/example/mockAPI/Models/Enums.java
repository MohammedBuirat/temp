package com.example.mockAPI.Models;

public class Enums {

    public enum TopicClass {
        Sport(0),
        Politics(1),
        Technology(2),
        Religion(3),
        Health(4);

        private final int value;

        TopicClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Role {
        ADMIN(0),
        USER(1);

        private final int value;

        Role(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum OffensiveClass {
        Normal(0),
        Offensive(1),
        HateSpeech(2);

        private final int value;

        OffensiveClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
