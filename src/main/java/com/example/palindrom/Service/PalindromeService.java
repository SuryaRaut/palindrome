package com.example.palindrom.Service;

import com.example.palindrom.Model.PalindromeModel;
import com.example.palindrom.Repo.PalindromeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalindromeService {
    //int resultStart, resultLength;
    @Autowired
    private PalindromeRepo palindromeRepo;

    public String postItem(PalindromeModel palindromeModel){
        palindromeRepo.save(palindromeModel);
        return "Successfully Added";
    }
    public PalindromeModel getPalindromeId(int id){
        if(palindromeRepo.existsById(id))
            return palindromeRepo.findById(id).get();
        return null;

    }

    public List<PalindromeModel> getAll(){
        return palindromeRepo.findAll();
    }





}
