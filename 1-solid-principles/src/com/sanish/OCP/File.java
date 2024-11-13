package com.sanish.OCP;

//According to OCP, Objects or entities should be open for extension but closed for modification.
//We could have created a single class to having methods to print metadata for every file types
//But it would violate OCP since we need to introduce new methods and fields for future file types.
public interface File {
    public String printFileMetaData();
}
