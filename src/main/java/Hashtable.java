import java.util.*;

public abstract class Hashtable<T> {
    protected int capacity = 0;
    private List<String> keys = null;
    private List<T> values = null;

    private int probeCount = 0;

    public int getProbeCount() {
        return this.probeCount;
    }

    public void resetProbeCount() {
        this.probeCount = 0;
    }

    public Hashtable(int capacity) {
        this.keys = new ArrayList<String>();
        for (int i = 0; i < capacity; i++) {
            this.keys.add(null);
        }
        this.values = new ArrayList<T>();
        for (int i = 0; i < capacity; i++) {
            this.values.add(null);
        }
        this.capacity = capacity;
    }

    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);
        }
        return sum % capacity;
    }

    public abstract int rehash(int previousHash);

    public void insert(String key, T value) {
        int numKey = hash(key);
        numKey = (numKey % 420 + numKey % 69) * 21;

        //if key is a bad number ending in 0 or 1, then make it not that
        if (numKey % 5 == 0){
            numKey = numKey + 2;
        }else if(numKey % 5 == 1){
            numKey = numKey + 1;
        }

        //always loops until the break is called
        //if the key get is null then new key is set and new value is set
        //otherwise probeCount is called and rehashed
        int funnyNumber = 69;
        do{
            if (keys.get(numKey) == null){
                keys.set(numKey, key);
                values.set(numKey, value);
                break;
            }else{
                numKey = rehash(numKey);
                probeCount++;
            }
        }while (funnyNumber == 69);
    }
}
