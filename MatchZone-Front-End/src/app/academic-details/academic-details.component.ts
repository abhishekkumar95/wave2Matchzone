import { TokenStorage } from './../core/token.storage';
import { Component, OnInit } from '@angular/core';
import { Academic } from '../model/academic';
import { AcademicsService } from '../services/academics.service';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
@Component({
  selector: 'app-academic-details',
  templateUrl: './academic-details.component.html',
  styleUrls: ['./academic-details.component.css']
})
export class AcademicDetailsComponent implements OnInit {
  academic:Academic=new Academic();
  error:any;
  constructor(private academicService:AcademicsService,private token:TokenStorage,private router:Router) {
    this.academic.userName=token.getUserName();
   }

  ngOnInit() {
  }
  onSubmit(academic:Academic){
    this.academic=academic;
    console.log(this.academic);
      this.academicService.postAcademic(this.academic).subscribe(
        data=> {console.log(data)
          error => {(this.error =error);}
        });
       
  }

}
