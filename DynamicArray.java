class DynamicArray
{
    Object[] items;
    int insertionPoint;
    
    DynamicArray()
    {
        items = new Object[10];
        insertionPoint = 0;
    }
    
    /**
     * Returns the number of items actually in the array.
     * 
     * This is different than the capacity of the array.
     */
    int size()
    {
        return insertionPoint;
    }
    
    /**
     * Add the given object to the end of the array.
     */
    void add(Object obj)
    {
        items[insertionPoint] = obj;
        
        insertionPoint++;
        
        //TODO: expand the array if the insertionPoint goes past the end
        
        if (insertionPoint >= items.length)
        {
            expand();
        }
    }
    
    /**
     * Remove the last item from the array.
     */
    void remove()
    {
        items[insertionPoint - 1] = null;
        
        insertionPoint--;
    }
    
    /**
     * Double the size of the array.
     * 
     * Algorithm:
     * Make a new array that is double the size of "items".
     * Copy over the items one by one into the new array
     * Set items equal to the expanded array
     */
    void expand()
    {
        Object[] expandedArray = new Object[items.length * 2];
        
        for (int i = 0; i < insertionPoint; i++)
        {
            expandedArray[i] = items[i];
        }
        
        items = expandedArray;
    }
    
    /**
     * Retrieve the object at the given index.
     */
    Object get(int index)
    {
        if (index < 0 || index > insertionPoint)
        {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        return items[index];
    }
}
