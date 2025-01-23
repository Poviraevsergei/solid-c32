public class Examples {
/*    //1
    public class User {
        // Данные пользователя
    }

    public class UserService {
        public void saveUser (User user) {
            // Сохранение пользователя
        }

        public void sendEmail(User user) {
            // Отправка email пользователю
        }
    }*/
    
    
    //-------------------------------------------------------
    
    
/*    //2
    public interface Worker {
        void work();
        void eat();
    }

    public class Robot implements Worker {
        @Override
        public void work() {
            // Работает
        }

        @Override
        public void eat() {
            throw new UnsupportedOperationException("Робот не ест");
        }
    }*/


    //-------------------------------------------------------


/*    //3
    public class Database {
        public void save() {
            // Сохранение в базу данных
        }
    }

    public class UserService {
        private Database database = new Database();

        public void saveUser () {
            database.save();
        }
    }*/


    //-------------------------------------------------------


/*    //4
    public class User {
        public User(String name) {
            // Сохранение пользователя в базу данных
            // Отправка приветственного email
        }
    }*/


    //-------------------------------------------------------

    
/*    //5
    public class TaxCalculator {
        public double calculateTax(Employee employee) {
            if (employee.getType() == "FULL_TIME") {
                return employee.getSalary() * 0.3;
            } else if (employee.getType() == "PART_TIME") {
                return employee.getSalary() * 0.2;
            }
            return 0;
        }
    }*/


    //-------------------------------------------------------


  /*  //6
    public class Rectangle {
        private double width;
        private double height;

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    public class Square extends Rectangle {
        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        @Override
        public void setHeight(double height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }
*/

    //-------------------------------------------------------


    
/*    //7
    public class FileLogger {
        public void log(String message) {
            
        }
    }

    public class UserService {
        private FileLogger logger = new FileLogger();

        public void registerUser(String username) {
            // Регистрация пользователя
            logger.log("User  registered: " + username);
        }
    }*/
}
