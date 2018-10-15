import { TokenStorage } from './../core/token.storage';
import { Component, OnInit } from '@angular/core';
import { Projects } from '../model/projects';
import { ProjectsService } from '../services/projects.service';
import { Router } from "@angular/router";
import { error } from "@angular/compiler/src/util";
@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {
  projects:Projects=new Projects();
  error:any;
  constructor(private projectService:ProjectsService,private token:TokenStorage,private router:Router) {
    this.projects.userName=token.getUserName();
   }

  ngOnInit() {
  }
  onSubmit(projects:Projects){
    this.projects=projects;
    console.log(this.projects);
      this.projectService.postProjects(this.projects).subscribe(
        data=> {console.log(data)
          error => {(this.error =error);}
        });
        
  }

}
