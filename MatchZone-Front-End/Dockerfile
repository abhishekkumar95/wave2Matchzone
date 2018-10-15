FROM node:latest
RUN mkdir -p /matchzone
WORKDIR /matchzone
COPY package.json /matchzone/
RUN npm install --force
RUN npm cache verify
COPY . /matchzone
EXPOSE 4200/tcp
CMD ["npm", "start", "--", "--host", "0.0.0.0", "--poll", "2000"]
