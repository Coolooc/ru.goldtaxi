package Entity;

public class Car {
    private String carMark;
    private String carNumber;
    private boolean isHaveBabySeat;
    private boolean isSmokeCar;
    private String carStatus;
    private int carClass;
    private static final int TYPE_OF_CLASS_ECONOMIC = 0;
    private static final int TYPE_OF_CLASS_BUSYNESS = 1;
    private static final String TYPE_OF_STATUS_FREE = "Свободен";
    private static final String TYPE_OF_STATUS_RESERVED = "Занят";
    private Driver carDriver;
}
