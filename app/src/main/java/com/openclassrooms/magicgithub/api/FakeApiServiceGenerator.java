package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("002", "Paul", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("003", "Phil", "https://i.pravatar.cc/150?u=a042581f4e29026704f"),
            new User("004", "Guillaume", "https://i.pravatar.cc/150?u=a042581f4e29026704f"),
            new User("005", "Francis", "https://i.pravatar.cc/150?u=a042581f4e29026704b"),
            new User("006", "George", "https://i.pravatar.cc/150?u=a042581f4e29026704c"),
            new User("007", "Louis", "https://i.pravatar.cc/150?u=a042581f4e29026703d"),
            new User("008", "Mateo", "https://i.pravatar.cc/150?u=a042581f4e29026703b"),
            new User("009", "April", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("010", "Louise", "https://i.pravatar.cc/150?u=a042581f4e29026706d"),
            new User("011", "Elodie", "https://i.pravatar.cc/150?u=a042581f4e29026702d"),
            new User("012", "Helene", "https://i.pravatar.cc/150?u=a042581f4e29026702e"),
            new User("013", "Fanny", "https://i.pravatar.cc/150?u=a042581f4e29026702f"),
            new User("014", "Laura", "https://i.pravatar.cc/150?u=a042581f4e29026702f"),
            new User("015", "Gertrude", "https://i.pravatar.cc/150?u=a042581f4e29026702a"),
            new User("016", "Chloé", "https://i.pravatar.cc/150?u=a042581f4e29026702j"),
            new User("017", "April", "https://i.pravatar.cc/150?u=a042581f4e29026702m"),
            new User("018", "Marie", "https://i.pravatar.cc/150?u=a042581f4e29026702o"),
            new User("019", "Henri", "https://i.pravatar.cc/150?u=a042581f4e29026702q"),
            new User("020", "Rémi", "https://i.pravatar.cc/150?u=a042581f4e29026702l"),
            new User("21","Amine","https://media-exp1.licdn.com/dms/image/C5603AQF2IIp_JGZ4hQ/profile-displayphoto-shrink_400_400/0?e=1610582400&v=beta&t=kKol0Zu3kv73_FIlModxhH4wmCfKYAaLQyvc3rUS8Aw")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://cdn.icon-icons.com/icons2/901/PNG/512/github_icon-icons.com_69253.png"),
            new User("022", "Geoffrey", "https://cdn.icon-icons.com/icons2/901/PNG/512/github_icon-icons.com_69253.png"),
            new User("023", "Simon", "https://cdn.icon-icons.com/icons2/901/PNG/512/github_icon-icons.com_69253.png"),
            new User("024", "André", "https://cdn.icon-icons.com/icons2/901/PNG/512/github_icon-icons.com_69253.png"),
            new User("025", "Leopold", "https://cdn.icon-icons.com/icons2/901/PNG/512/github_icon-icons.com_69253.png")
    );
}
