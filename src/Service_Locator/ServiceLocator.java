package Service_Locator;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator
{
    private final Map<Class<?>, Object> services = new HashMap<>();

    public <T extends IService> void Registery(Class<T> clazz, T instance)
    { services.put(clazz, instance); }

    public <T extends IService> T GetService(Class<T> clazz)
    { return clazz.cast(services.get(clazz));}
}
