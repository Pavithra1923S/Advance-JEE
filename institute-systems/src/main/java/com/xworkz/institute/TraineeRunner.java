package com.xworkz.institute;


public class TraineeRunner {

        public static void main(String[] args) {
            String traineeName = getTraineeNameById(1);
            String address = getTraineeAddressById(1);
            int age = getTraineeAgeById(1);
            System.out.println(" the trainee name is" + traineeName);
            System.out.println(" the trainnee adress is" + address);
            System.out.println("the trainee age is " + age);
        }


    public static  String getTraineeNameById(int id) {
        String traineeName = null;
        try {
            TraineeDto traineeDto = new TraineeDto();
            traineeDto.setTraineeId(1);
            traineeDto.setTraineeName("Baba");
            traineeDto.setAddress("RRNagar");
            traineeDto.setAge(35);

            if (traineeDto.getTraineeId() == id)
                traineeName = traineeDto.getTraineeName();
            else {
                TraineeNameNotFoundException traineeNameNotFoundException = new TraineeNameNotFoundException(" no trainee name found with id " + id);
                throw traineeNameNotFoundException;
            }
            }catch (TraineeNameNotFoundException ref){
            ref.printStackTrace();}

            return traineeName;

        }
        public static String getTraineeAddressById(int id) {
            String address = null;


            try {
                TraineeDto traineeDto = new TraineeDto();
                traineeDto.setTraineeId(1);
                traineeDto.setTraineeName("Baba");
                traineeDto.setAddress("RRNagar");
                traineeDto.setAge(35);
                if (traineeDto.getTraineeId() == id)
                    address = traineeDto.getAddress();
                else {
                    TraineeAddressNotFoundException traineeAddressNotFoundException = new TraineeAddressNotFoundException(" no trainee address found with id " + id);
                    throw traineeAddressNotFoundException;
                }
            } catch (TraineeAddressNotFoundException ref) {
                ref.printStackTrace();
            }

            return address;
        }
    public static  int getTraineeAgeById(int id) {
        int age  = 0;
        try {
            TraineeDto traineeDto = new TraineeDto();
            traineeDto.setTraineeId(1);
            traineeDto.setTraineeName("Baba");
            traineeDto.setAddress("RRNagar");
            traineeDto.setAge(35);

            if (traineeDto.getTraineeId() == id)
                age = traineeDto.getAge();
            else {
                TraineeAgeNotFoundException traineeAgeNotFoundException = new TraineeAgeNotFoundException(" no trainee age found with id " + id);
                throw traineeAgeNotFoundException;
            }
        }catch (TraineeAgeNotFoundException ref){
            ref.printStackTrace();}

        return age;

    }

}
