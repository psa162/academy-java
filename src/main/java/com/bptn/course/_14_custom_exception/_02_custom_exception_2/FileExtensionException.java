package com.bptn.course._14_custom_exception._02_custom_exception_2;


// Define a custom exception class
class FileExtensionException extends Exception {
    public FileExtensionException(String message) {
        super(message);
    }
}


