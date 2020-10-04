package com.example.palindrom.Controller;

import com.example.palindrom.Model.PalindromeModel;
import com.example.palindrom.Service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {
    int resultStart, resultLength;
    @Autowired
    private PalindromeService palindromeService;
    @PostMapping("/post")
    public String addPalindrome(@RequestBody PalindromeModel palindromeModel){

        String palindrome = palindromeModel.getPalindromeString();
        String longPalindrome = longestPalindrome(palindrome);
        palindromeModel.setPalindromeString(longPalindrome);
        return palindromeService.postItem(palindromeModel);

    }

    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return "";
        }
        if(s.length()<2){
            return s;
        }
        for(int i = 0; i< s.length(); i++){
            palindromeCheck(s,i,i);
            palindromeCheck(s, i, i+1);

        }
        return s.substring(resultStart, resultStart + resultLength);

    }
    void palindromeCheck(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(resultLength < end - start -1){
            resultStart = start + 1;
            resultLength = end - start -1;
        }
    }

    @GetMapping("/getPalindrome/{id}")
    public PalindromeModel getPalindromeString(@PathVariable int id){
        return palindromeService.getPalindromeId(id);
    }

    @GetMapping("/getPalindromes")
    public List<PalindromeModel> getPalindromes(){
        return palindromeService.getAll();
    }

}
