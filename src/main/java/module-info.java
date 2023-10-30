module com.example.internsavy_java_programming_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.internsavy_java_programming_project to javafx.fxml;
    exports com.example.internsavy_java_programming_project;
}