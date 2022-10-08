package com.kunaaal.stackQueues;

import java.util.Stack;

public class validParanthese {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '{'){
                stack.push(ch);
            } else if (ch == ')'){

            } else if (ch == '}'){

            } else if (ch ==']'){

            }

        }



        return false;
    }
}
