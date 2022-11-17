package Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

@Dao
public interface CarDAO {
    @Insert
    public long addCar(Car car);

    @Update
    public void updateCar(Car car);

    @Delete
    public void deleteCar(Car car);

    // Забираем все данные из таблицы cars
    @Query("select * from cars")
    public List<Car> getAllCars();

    // Запрос записи об одном автомобиле
    @Query("select * from cars where car_id ==:carId ")
    public Car getCar(long carId);
}