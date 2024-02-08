package com.personalsoft.estudio;

import java.util.List;

public class Group {

    public String groupName;
    public List<Student> students;
    public Group(List<Student> students) {
        super();
        this.students = students;
    }

    public Group() {
        super();
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group [name=" + groupName + ", students=" + students + "]";
    }
}
