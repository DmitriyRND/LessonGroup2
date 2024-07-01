package CollectionMap;

import java.util.List;


    public class RecordBook {
        private int id;
        private int internshipExperienceDay;
        private String nameInstitute;
        private List<Integer> grades;

        // Конструктор, принимающий все параметры
        public RecordBook(int id, int internshipExperienceDay, String nameInstitute, List<Integer> grades) {
            this.id = id;
            this.internshipExperienceDay = internshipExperienceDay;
            this.nameInstitute = nameInstitute;
            this.grades = grades;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getInternshipExperienceDay() {
            return internshipExperienceDay;
        }

        public void setInternshipExperienceDay(int internshipExperienceDay) {
            this.internshipExperienceDay = internshipExperienceDay;
        }

        public String getNameInstitute() {
            return nameInstitute;
        }

        public void setNameInstitute(String nameInstitute) {
            this.nameInstitute = nameInstitute;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public void setGrades(List<Integer> grades) {
            this.grades = grades;
        }

        // Метод для отображения информации о зачетной книжке
        @Override
        public String toString() {
            return "RecordBook{" +
                    "id=" + id +
                    ", internshipExperienceDay=" + internshipExperienceDay +
                    ", nameInstitute='" + nameInstitute + '\'' +
                    ", grades=" + grades +
                    '}';
        }
    }

