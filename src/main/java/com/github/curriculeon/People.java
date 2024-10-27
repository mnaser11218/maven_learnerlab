package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Collection;

public class People<Person> extends ArrayList<Person> {
    public People() {
    }

    public People(Collection<? extends Person> c) {
        super(c);
    }
}
