package com.C0Compiler.JavaCC;

public class MiddleCode {
    public static enum CodeType
    {
        LIT, LOD, STO, CAL, INT, JMP, JPC,
        ADD, SUB, MUL, DIV, RED, WRT, RET
    }
    public CodeType codeType;
    public int arg0;
    public int arg1;

    public MiddleCode(CodeType codeType, int arg0, int arg1)
    {
        this.codeType = codeType;
        this.arg0 = arg0;
        this.arg1 = arg1;
    }

    public String toString(){
        return codeType.toString()+" "+arg0+" "+arg1;
    }
    public String toOutString(){
        return codeType.toString()+"\t"+arg0+"\t"+arg1;
    }
}
