import { Component, OnInit } from '@angular/core';
import { Skills } from '../model/skills';
import { SkillsService } from '../services/skills.service';
import { TokenStorage } from '../core/token.storage';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
import { AutoCompletService } from '../services/autocomplete.service';
@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skills: Skills = new Skills();
  skillName:string="";
  result:string[]=[];;
  error: any;
  constructor(private skillService: SkillsService, private token: TokenStorage, private router: Router,private auto:AutoCompletService) {
    this.skills.userName = token.getUserName();
  }

  ngOnInit() {
  }
  
  onSubmit(skills: Skills) {
    this.skills = skills;
    console.log(this.skills);
    this.skillService.postSkills(this.skills).subscribe(
      data => {
        console.log(data)
        error => { (this.error = error);  }
      });
   
  }
}
