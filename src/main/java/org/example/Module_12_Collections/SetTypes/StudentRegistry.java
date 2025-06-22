    package org.example.Module_12_Collections.SetTypes;

    import java.util.HashSet;
    import java.util.List;

    public class StudentRegistry {
        public static void main(String[] args) {
            String[] course1 = {"Alice", "Bob", "Charlie", "Diana"};
            String[] course2 = {"Charlie", "Eva", "Alice", "Frank"};

            HashSet<String> course1Set = new HashSet<>(List.of(course1));
            HashSet<String> course2Set = new HashSet<>(List.of(course2));


            HashSet<String> unique = new HashSet<>(course1Set);
            unique.addAll(course2Set);

            HashSet<String> bothCourses = new HashSet<>(course1Set);
            bothCourses.retainAll(course2Set);

            HashSet<String> singleCourse = new HashSet<>(unique);
            singleCourse.removeAll(bothCourses);

            System.out.println("Унікальні стаденти: " + unique);
            System.out.println("Студенти, які навчаються на обох курсах: " + bothCourses);
            System.out.println("Студенти, які навчаються хоча б на одному з курсів: " + singleCourse);


        }
    }
