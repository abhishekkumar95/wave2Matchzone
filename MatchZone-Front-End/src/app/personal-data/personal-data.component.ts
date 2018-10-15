import { Component, OnInit } from '@angular/core';
import { Personal } from '../model/personal';
import { PersonalService } from '../services/personal.service';
import { TokenStorage } from '../core/token.storage';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
@Component({
  selector: 'app-personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent implements OnInit {
  personal: Personal = new Personal();
  error: any;

  constructor(private personalService: PersonalService, private token: TokenStorage, private router: Router) {

    this.personal.userName = token.getUserName();

  }

  ngOnInit() {
  }
  onSubmit(personal: Personal) {
    this.personal = personal;
    console.log(this.personal);
    this.personalService.postPersonal(this.personal).subscribe(
      data => {
        console.log(data);
        error => { (this.error = error);  }
      });
   
  }

}
