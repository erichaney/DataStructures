class DynamicArray
{
    int insertionPoint;
    Object[] items;
    
    DynamicArray()
    {
        insertionPoint = 0;
        items = new Object[10];
    }
    
    /**
     * Returns the current "size" of the array.
     * 
     * This is different than the actual capacity.
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
        //TODO: Expand the array if the insertion point reaches the end
        
        if (insertionPoint == items.length)
        {
            expand();
        }
        
    }
    
    /**
     * Remove the item at the end of the array.
     */
    void remove()
    {
        items[insertionPoint - 1] = null;
        insertionPoint--;
    }
    
    /**
     * Double the size of the current array.
     * 
     * Algorithm:
     * Create a new array double the size of the current one
     * Copy items over one by one
     * Make items equal to the expanded array.
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
}