package chapter3;

public class ScopeErr {
    int bar=1;{
        int bar =2;//скомпилировать эту программу нельзя
    }
}
