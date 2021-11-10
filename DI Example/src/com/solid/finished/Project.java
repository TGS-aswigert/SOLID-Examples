package com.solid.finished;

import java.util.List;

public class Project {
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(dev -> dev.develop());
    }
}
