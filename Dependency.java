// D - Принцип инверсии зависимостей (Dependency Inversion Principle):
// Создайте абстракцию Logger, которая будет иметь методы для логирования различных типов сообщений.
// Затем создайте классы FileLogger и DatabaseLogger, реализующие эту абстракцию.
// Теперь классы, которые требуют логирования, будут зависеть только от Logger, а не от конкретных реализаций.

interface Logger {
    public void logMessage();
}

class WriterLogs {
    private Logger log;

    public WriterLogs(Logger log) {
        this.log = log;
    }

    public void WriteLog() {
        log.logMessage();
    }
}

class FileLogger implements Logger {

    @Override
    public void logMessage() {
        System.out.println("Файл успешно записан!");
    }
}

class DatabaseLogger implements Logger {
    
    @Override
    public void logMessage() {
        System.out.println("Данные успешно сохранены в базе данных!");
    }
}

public class Dependency {
    
    public static void main(String[] args) {
        WriterLogs log1 = new WriterLogs(new FileLogger());
        log1.WriteLog();
        WriterLogs log2 = new WriterLogs(new DatabaseLogger());
        log2.WriteLog();       
    }
}