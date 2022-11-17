package Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import Model.Car;

// Указываем все entity классы, которые у нас есть
@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDatabase extends RoomDatabase {

    public abstract CarDAO getCarDAO();

}
