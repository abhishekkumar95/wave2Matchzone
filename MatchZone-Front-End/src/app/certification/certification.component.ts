import { Component, OnInit } from '@angular/core';
import { Certification} from "../model/certification";
import { CertificationService } from '../services/certification.service';
import { TokenStorage } from '../core/token.storage';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
@Component({
  selector: 'app-certification',
  templateUrl: './certification.component.html',
  styleUrls: ['./certification.component.css']
})
export class CertificationComponent implements OnInit {
  certification:Certification=new Certification();
  error:any;
  constructor(private certificationService:CertificationService,private token:TokenStorage,private router:Router) {
    this.certification.userName=token.getUserName();
   }

  ngOnInit() {
  }
  onSubmit(certification:Certification){
    this.certification=certification;
    console.log(this.certification);
      this.certificationService.postCertification(this.certification).subscribe(
        data=>{ console.log(data)
          error => {(this.error =error);}
        });
       
  }
}
