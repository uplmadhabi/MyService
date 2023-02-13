package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import SepratePackage.aidlInterface;

public class MyService extends Service {
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return  stubObject;
    }

    private final  aidlInterface.Stub stubObject = new aidlInterface.Stub(){
        @Override
        public int add(int x, int y) throws RemoteException {
            return x +y;
        }

        @Override
        public int subtract(int x, int y) throws RemoteException {
            return x - y;
        }

        @Override
        public int multiply(int x, int y) throws RemoteException {
            return x * y;
        }

        @Override
        public int division(int x, int y) throws RemoteException {
            return x / y;
        }

        @Override
        public int modulus(int x, int y) throws RemoteException {
            return x % y;
        }

        @Override
        public int power(int x, int y) throws RemoteException {
            return (int) Math.pow(x,y);
        }


//    @Override
//    public int CalculateData(int firstValue, int secondValue, int operationToPerform) throws RemoteException {
//      return 0;
////              performCalculation(firstValue,secondValue,operationToPerform);
//    }
};

//    private int performCalculation(int firstValue, int secondValue, int operation) {
//
//        switch (operation) {
//            case 1:
//                return firstValue + secondValue;
//
//            case 2:
//                return firstValue - secondValue;
//
//            case 3:
//                return firstValue * secondValue;
//
//            case 4:
//                return firstValue / secondValue;
//            case 5:
//                return firstValue % secondValue;
//            case  6:
//                return (int) Math.pow(firstValue,secondValue);
//
//            default:
//                Log.d("Calculator App: ","Invalid Operation");
//                return 0;
//        }
//    }


}