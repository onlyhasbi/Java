package com.hasbi.SpringBootWeb.controller;

import com.hasbi.SpringBootWeb.model.Mahasiswa;
import com.hasbi.SpringBootWeb.services.MahasiswaService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MahasiswaController {

    private MahasiswaService mahasiswaService;

    @Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @RequestMapping("/mahasiswa")
    public String mahasiswaList(Model model){
        model.addAttribute("mahasiswa",mahasiswaService.listMahasiswa());
        return "mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/create",method = RequestMethod.GET)
    public String createMahasiswa(Model model){
        model.addAttribute("mahasiswa",new Mahasiswa());
        return "addmahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/create",method = RequestMethod.POST)
    public String saveMahasiswa(Model model,Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa",mahasiswaService.saveMahasiswa(mahasiswa));
        return "redirect:/mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/edit/{id}",method = RequestMethod.GET)
    public String editMahasiswa(@PathVariable Integer id,Model model){
        model.addAttribute("mahasiswa",mahasiswaService.getIdMahasiswa(id));
        return "addmahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/delete/{id}",method = RequestMethod.GET)
    public String deleteMahasiswa(@PathVariable Integer id){
        mahasiswaService.deleteMahasiswa(id);
        return "redirect:/mahasiswa";
    }
}
