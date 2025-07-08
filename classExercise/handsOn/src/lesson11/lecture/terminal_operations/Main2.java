package lesson11.lecture.terminal_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Boolean> fileStatus = List.of(false, true, false, true, true, false, true, false, true, false);//every primitive b                                                                  oolean data is automatically boxed to Boolean object
        //any match => if any defective file, raise an alert

        boolean uploadingStatus = fileStatus.stream().anyMatch(data -> data.booleanValue());// booleanValue() is not necessary, but it is used to show that the primitive boolean is automatically unboxed to Boolean object
        if (uploadingStatus) {
            System.out.println("There is a defective file, please check the files.");
        } else {
            System.out.println("All files are uploaded successfully.");
        }
        System.out.println("--------------------------------------------------");

        //no defective files are presentes, true means that a file is with a mistake
        List<Boolean> fileStatus2 = List.of(false, false, false, false, false, false, false, false, false, false);
        //apply allmatch, if return true, means taht all values are false, so no defective files are present
        boolean allFilesUploaded = fileStatus2.stream().allMatch(data -> !data.booleanValue());

        if (allFilesUploaded) {
            System.out.println("All files are uploaded successfully.");
        } else {
            System.out.println("There are some defective files, please check the files.");
        }
        System.out.println("--------------------------------------------------");
        List<String> colors = List.of("red", "green", "blue", "yellow", "orange", "purple");
        boolean hasColor = colors.stream()
                .anyMatch(color -> color.equals("red"));// check if there is a red color in the list
        if(hasColor){
            System.out.println("There is a red color in the list.");
        } else {
            System.out.println("There is no red color in the list.");
        }

    }
}
