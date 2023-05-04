
    public class Student {
        int id;
        String FIO;
        int year;
        String faculty;
        int course;
        String group;

        public Student(int id, String FIO, int year, String faculty, int course, String group) {
            this.id = id;
            this.FIO = FIO;
            this.year = year;
            this.faculty = faculty;
            this.course = course;
            this.group = group;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFIO() {
            return FIO;
        }

        public void setFIO(String FIO) {
            this.FIO = FIO;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", FIO='" + FIO + '\'' +
                    ", year=" + year +
                    ", faculty='" + faculty + '\'' +
                    ", course=" + course +
                    ", group='" + group + '\'' +
                    '}';
        }
    }

