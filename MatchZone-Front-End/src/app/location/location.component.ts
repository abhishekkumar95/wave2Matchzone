import { Component, OnInit } from '@angular/core';
import { LocationService } from '../services/location.service';
import {Location} from "../model/location";
import { TokenStorage } from '../core/token.storage';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {
  location:Location=new Location();
  error:any;
  constructor(private locationService:LocationService,private token:TokenStorage,private router:Router) {
    this.location.userName=token.getUserName();
   }

  ngOnInit() {
  }
  onSubmit(location:Location){
    this.location=location;
    console.log(this.location);
      this.locationService.postLocation(this.location).subscribe(
        data=> {console.log(data)
          error => {(this.error =error);}
        });
        
  }

}
