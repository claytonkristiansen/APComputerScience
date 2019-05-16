import java.util.*;

public class Entry<K, V> implements Map.Entry<K, V>
{
	private K Key;
	private V Value;
	
	Entry()
	{
		Key = null;
		Value = null;
	}
	
	Entry(K key, V value)
	{
		Key = key;
		Value = value;
	}
	
	
	@Override
	public K getKey() 
	{
		return Key;
	}

	@Override
	public V getValue() 
	{
		return Value;
	}

	@Override
	public V setValue(V value) 
	{
		Value = value;
		return value;
	}
	
	public K setKey(K key) 
	{
		Key = key;
		return key;
	}

}
